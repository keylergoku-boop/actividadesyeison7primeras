Algoritmo TablaMultiplicar
	
    Definir N, i, resultado, pares Como Entero
	
    pares <- 0
	
    Escribir "Ingrese un numero:"
    Leer N
	
    Para i <- 1 Hasta 10 Hacer
		
        resultado <- N * i
		
        Escribir N," x ",i," = ",resultado
		
        Si resultado MOD 2 = 0 Entonces
            pares <- pares + 1
        FinSi
		
    FinPara
	
    Escribir "Cantidad de pares: ", pares
	
FinAlgoritmo
