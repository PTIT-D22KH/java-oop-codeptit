import os
import shutil
import zipfile
from datetime import datetime

def is_package_modified(java_files, zip_filepath):
    """Check if any Java file in the package is newer than the existing zip file."""
    if not os.path.exists(zip_filepath):
        return True  # Zip file doesn't exist, so package is considered modified

    zip_mod_time = os.path.getmtime(zip_filepath)
    
    for file in java_files:
        file_mod_time = os.path.getmtime(file)
        if file_mod_time > zip_mod_time:
            return True  # At least one Java file is newer than the zip file
    
    return False  # No files are newer than the zip file

def copy_and_zip_packages(src_dir, dest_dir):
    # Ensure the destination directory exists
    if not os.path.exists(dest_dir):
        os.makedirs(dest_dir)

    # Walk through the source directory
    for root, dirs, files in os.walk(src_dir):
        # Filter out only .java files
        java_files = [os.path.join(root, f) for f in files if f.endswith('.java')]
        
        # If the directory contains more than one Java file
        if len(java_files) > 1:
            # Get the relative path of the package
            package_name = os.path.basename(root)
            zip_filename = f"{package_name}.zip"
            zip_filepath = os.path.join(dest_dir, zip_filename)

            # Check if the package has been modified and needs to be rezipped
            if not is_package_modified(java_files, zip_filepath):
                print(f"Skipping {package_name} as it is already zipped and up to date.")
                continue

            # Create the package path in the destination
            package_path = os.path.join(dest_dir, package_name)

            if not os.path.exists(package_path):
                os.makedirs(package_path)

            # Copy the Java files to the destination package folder
            for file in java_files:
                shutil.copy(file, package_path)

            # Create a zip file for the package
            with zipfile.ZipFile(zip_filepath, 'w') as zipf:
                # Add the files to the zip file under the package folder name
                for file in java_files:
                    file_path = os.path.join(package_path, os.path.basename(file))
                    arcname = os.path.join(package_name, os.path.basename(file))
                    zipf.write(file_path, arcname)

            # Remove the original copied Java files and folder (optional)
            shutil.rmtree(package_path)

if __name__ == "__main__":
    # Define the source and destination directories
    src_directory = './classwork/classwork/src'  # Adjusted for your project structure
    dest_directory = './classwork/classwork/submit_zip_file'  # Adjusted for your project structure

    # Copy Java files and zip the packages that contain more than 1 Java class file
    copy_and_zip_packages(src_directory, dest_directory)

    print(f"Zipped modified/new packages to {dest_directory}")
