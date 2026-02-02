# EJ1
## COMANDOS
### Actualizar a maquina
sudo apt update && sudo apt upgrade 
### Instalar VSCode
sudo apt update 
sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"   
sudo apt install code 
### Instalar Compilador Java
sudo apt install default-jre
### Instalar Intérprete Java
sudo apt install default-jre
### Instalar Compilador C
sudo apt install build-essential 
### Instalar Interprete Python3
sudo apt install -y python3
## EJEMPLOS CREACION PROGRAMAS DESDE TERMINAL
### JAVA
`nano Ola.java`
```
public class Ola {
    public static void main(String[] args) {
        System.out.println("Ola");
    }
}   
```
`javac Ola.java`
`java Ola.java`
### C
`nano ola.c`
```
#include<stdio.h>
int main(){
	printf("Ola\n");
	return 0;
}
```
`gcc ola.c -o ola`
`./ola`

### PYTHON
`python3 -c "print('Ola')"`
