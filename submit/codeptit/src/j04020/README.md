## ./j04020
![alt text](image.png)
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        boolean check = false;
        for(int i = 2; i <= 2*Math.sqrt(n); i++){
            Pair<Integer, Integer> p = new Pair<>(i, n-i);
            if(p.isPrime()){
                System.out.println(p);
                check = true;
                break; 
            }
        }
        if(!check) System.out.println(-1);
    }
}
```
- [input.txt](input.txt)
- [j04020.class](j04020.class)
- [j04020.java](j04020.java)
- [j04020.mdj](j04020.mdj)
- [Main.jpg](Main.jpg)
- [output.txt](output.txt)
- [Pair.class](Pair.class)
- [Pair.java](Pair.java)
- [README.md](README.md)
