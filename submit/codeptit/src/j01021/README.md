## j01021
![alt text](image.png)

- [image.png](image.png)
- [input.txt](input.txt)
- [j01021.class](j01021.class)
- [j01021.java](j01021.java)
- [output.txt](output.txt)
- [README.md](README.md)

### Note

Add this line of code to avoid MLE:

```java

if (b == 1) {
    return a;
}
if (b == 0) {
    return 1;
}
if (a == 0) {
    return 0;

}
if (a == 1) {
    return 1;
}
```