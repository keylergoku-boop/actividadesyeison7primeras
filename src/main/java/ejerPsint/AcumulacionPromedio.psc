Algoritmo AcumulacionPromedio
	
    Definir num, suma, promedio Como Real
    Definir contador Como Entero
	
    suma <- 0
    contador <- 0
	
    Repetir
		
        Escribir "Ingrese un numero:"
        Leer num
		
        Si num >= 0 Entonces
            suma <- suma + num
            contador <- contador + 1
        FinSi
		
    Hasta Que num < 0
	
    Si contador > 0 Entonces
        promedio <- suma / contador
		
        Escribir "Suma: ", suma
        Escribir "Promedio: ", promedio
    Sino
        Escribir "No se ingresaron numeros validos"
    FinSi
	
FinAlgoritmo
