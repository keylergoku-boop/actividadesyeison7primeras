Algoritmo ParidadYSigno
	
    Definir num Como Entero
	
    Escribir "Ingrese un numero:"
    Leer num
	
    Si num MOD 2 = 0 Entonces
        Escribir "Es PAR"
    Sino
        Escribir "Es IMPAR"
    FinSi
	
    Si num > 0 Entonces
        Escribir "Es POSITIVO"
    Sino
        Si num < 0 Entonces
            Escribir "Es NEGATIVO"
        Sino
            Escribir "Es CERO"
        FinSi
    FinSi
	
FinAlgoritmo
