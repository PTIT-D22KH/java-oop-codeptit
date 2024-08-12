#!/bin/bash

# Function to update README.md with all files in the directory
update_readme() {
    local dir=$1
    local readme_file="$dir/README.md"

    # Clear the existing content in README.md
    echo "## $dir" > "$readme_file"
    echo "![alt text](image.png)" >> "$readme_file"
    echo "" >> "$readme_file"
    
    # Add hyperlinks to all files in the directory
    for file in "$dir"/*; do
        if [ -f "$file" ]; then
            filename=$(basename -- "$file")
            echo "- [$filename]($filename)" >> "$readme_file"
        fi
    done
}

# Get the directory of the Java file
dir=$(dirname -- "$1")

# Update README.md before compiling
update_readme "$dir"

# Get the base name of the Java file
filename=$(basename -- "$1")
filename="${filename%.*}"

# Compile the Java file
javac "$1"

# If compilation was successful, run the Java program
if [ $? -eq 0 ]; then
    # Assuming the directory structure represents the package name,
    # and considering the directory as part of the classpath.
    # The class name is specified without the .java extension and without the directory path.
    # Adjust the classpath (-cp) to include the root directory of your class files if necessary.
    cd "$dir/.." # Move up to include 'dsa01001' as part of the classpath
    java -cp "." "$filename/$filename" < "$filename/input.txt"
fi