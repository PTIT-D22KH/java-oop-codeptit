import os

def generate_directory_structure(base_dir):
    structure = "\n## Project Directory Structure\n\n"
    
    for root, dirs, files in os.walk(base_dir):
        # Ignore the .git directory
        dirs[:] = [d for d in dirs if d != '.git']
        
        # Sort directories and files
        dirs.sort()
        files.sort()
        
        level = root.replace(base_dir, '').count(os.sep)
        indent = ' ' * 4 * level
        relative_root = os.path.relpath(root, base_dir).replace("\\", "/")
        if level == 0:
            structure += f"- [{os.path.basename(root)}/]({relative_root})\n"
        else:
            structure += f"{indent}- [{os.path.basename(root)}/]({relative_root})\n"
        
        sub_indent = ' ' * 4 * (level + 1)
        for file in files:
            if file != 'README.md':  # Avoid linking to the README.md itself
                file_path = os.path.join(root, file).replace("\\", "/")
                relative_path = os.path.relpath(file_path, base_dir).replace("\\", "/")
                structure += f"{sub_indent}- [{file}]({relative_path})\n"
    
    return structure

def update_readme(readme_path, new_content):
    with open(readme_path, 'r') as readme_file:
        content = readme_file.read()
    
    if "## Project Directory Structure" in content:
        start_index = content.index("## Project Directory Structure")
        end_index = content.find("\n## ", start_index + 1)
        if end_index == -1:
            end_index = len(content)
        updated_content = content[:start_index] + new_content + content[end_index:]
    else:
        updated_content = content + new_content
    
    with open(readme_path, 'w') as readme_file:
        readme_file.write(updated_content)

if __name__ == "__main__":
    base_directory = '.'  # Root directory of the project
    readme_file_path = os.path.join(base_directory, 'README.md')
    
    new_directory_structure = generate_directory_structure(base_directory)
    update_readme(readme_file_path, new_directory_structure)