#!/bin/bash

# Function to update README.md with all files in the directory
update_readme() {
    local dir=$1
    local readme_file="$dir/README.md"

    # Temporarily store lines that contain image links and headers
    local temp_file=$(mktemp)

    # Preserve the section header and image links
    if [ -f "$readme_file" ]; then
        grep -E '^\#|!\[alt text\]' "$readme_file" > "$temp_file"
    fi

    # Clear the existing content in README.md
    echo "" > "$readme_file"

    # If the section header is not already in the file, add it
    if ! grep -q "## $dir" "$temp_file"; then
        echo "## $dir" >> "$readme_file"
    fi
    
    # Add back the preserved lines
    if [ -s "$temp_file" ]; then
        cat "$temp_file" >> "$readme_file"
        echo "" >> "$readme_file"
    fi

    # Add hyperlinks to all files in the directory
    for file in "$dir"/*; do
        if [ -f "$file" ]; then
            filename=$(basename -- "$file")
            echo "- [$filename]($filename)" >> "$readme_file"
        fi
    done

    # Clean up the temporary file
    rm "$temp_file"
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