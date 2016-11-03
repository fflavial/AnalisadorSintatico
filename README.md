# AnalisadorSintatico

Flávia Lessa de Aguiar
Trabalho de Construção de Compiladores, Analisador Sintatico com antlr.
A gramática esta no arquivo Hello.g4

Depois de baixar, caso esteja no windows, abra o cmd e escreva o seguinte:

SET CLASSPATH=.;C:\Javalib\antlr-4.5-complete.jar;%CLASSPATH%
doskey antlr4=java org.antlr.v4.Tool $*
doskey grun =java org.antlr.v4.runtime.misc.TestRig $*

Ainda no cmd, procure a pasta em que a gramatica está e escreva o seguinte:

antlr4 Hello.txt

javac Hello*.java

grun Hello mainClass -gui                          (PODE MUDAR)

Depois escreva um código na linguagem JAVA e ctrl+Z!
