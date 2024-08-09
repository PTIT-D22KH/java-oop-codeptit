import os
import shutil
import zipfile

def copy_and_zip_packages(src_dir, dest_dir):
    # Ensure the destination directory exists
    if not os.path.exists(dest_dir):
        os.makedirs(dest_dir)

    # Walk through the source directory
    for root, dirs, files in os.walk(src_dir):
        # Filter out only .java files
        java_files = [f for f in files if f.endswith('.java')]
        
        # If the directory contains more than one Java file
        if len(java_files) > 1:
            # Get the relative path of the package
            relative_path = os.path.relpath(root, src_dir)
            package_name = os.path.basename(root)
            package_path = os.path.join(dest_dir, package_name)

            if not os.path.exists(package_path):
                os.makedirs(package_path)

            # Copy the Java files to the destination package folder
            for file in java_files:
                shutil.copy(os.path.join(root, file), package_path)

            # Create a zip file for the package
            zip_filename = f"{package_name}.zip"
            zip_filepath = os.path.join(dest_dir, zip_filename)

            with zipfile.ZipFile(zip_filepath, 'w') as zipf:
                # Add the files to the zip file under the package folder name
                for file in java_files:
                    file_path = os.path.join(package_path, file)
                    arcname = os.path.join(package_name, file)
                    zipf.write(file_path, arcname)

            # Remove the original copied Java files and folder (optional)
            shutil.rmtree(package_path)

if __name__ == "__main__":
    # Define the source and destination directories
    src_directory = './submit/codeptit/src'  # Adjusted for your project structure
    dest_directory = './submit/codeptit/submit_zip_file'  # Adjusted for your project structure

    # Copy Java files and zip the packages that contain more than 1 Java class file
    copy_and_zip_packages(src_directory, dest_directory)

    print(f"Zipped relevant packages to {dest_directory}")
