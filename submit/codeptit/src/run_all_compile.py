import os
import subprocess

# Path to the src directory
src_dir = "."

# Path to the compile.sh script
compile_script = os.path.join(src_dir, "compile.sh")

# Function to run the compile.sh script for all Java files in the src directory
def run_compile_for_all():
    print("Starting to traverse directories...")  # Debug statement
    for root, dirs, files in os.walk(src_dir):
        print(f"Checking directory: {root}")  # Debug statement
        for file in files:
            print(f"Found file: {file}")  # Debug statement
            if file.endswith(".java"):
                # Construct the relative path to the Java file
                java_file_path = os.path.join(root, file)
                print(f"Found Java file: {java_file_path}")  # Debug statement
                
                # Run the compile.sh script for this Java file
                try:
                    print(f"Running {compile_script} for {java_file_path}")
                    subprocess.run([compile_script, java_file_path], check=True)
                except subprocess.CalledProcessError as e:
                    print(f"Error while running {compile_script} for {java_file_path}: {e}")

# Run the function
if __name__ == "__main__":
    run_compile_for_all()
