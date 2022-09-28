**Ejercicio 1.**
- Dada la siguiente expresión postfija : I J K + + A B * C - * , dibuje su correspondiente árbol binario de expresión

_Estrategia:_ Postfijo: si es un operando, lo apilo. Si es un operador, lo tomo como raíz y desapilo como hd e hi a los nodos. Lo nuevo a apilar 

Pila: I , J,  K 
Desapilo -> J + K -> lo apilo 
Pila: I , J+K 
Desapilo -> I + (J+K) -> lo apilo 
Pila:  I + (J+K) , A , B 
Desapilo -> A * B -> lo apilo 
Pila:  I + (J+K) , (A * B) , C 
Desapilo -> C - ( A * B) -> lo apilo 
Pila: (I + (J+K)) , (C - ( A * B)) 
Desapilo ->  (I + (J+K)) * (C - ( A * B)) 

Árbol: 

						*
					/    \ 
				+        - 
			/   \    /   \
         I      +  C     * 
                     / \      / \ 
                    J  K     A  B  
- Convierta la expresión ((a + b) + c * (d + e) + f ) * (g + h) en expresión prefija
La expresión está inOrden (hi - r - hd ) y hay que pasarla a prefija ( r - hi - hd)
`` * , * , + , + , a , b , c , + , + , d , e , f , + , g , h`` 

**Ejercicio 2.**
- Dada la siguiente expresión prefija : * + I + J K - C * A B , dibuje su correspondiente árbol binario de expresión

_Estrategia:_ Si es un operador : se anida conectando con el hijo izquierdo o el derecho segun corresponda, si es un operando es una hoja y esa rama queda "inhabilitada"

																* 
															/   \ 
														+       - 
													/   \   /   \
												I      + C     + 
												            / \     / \
												          J   K   A   B 

- Convierta la expresión ((a + b) + c * (d + e) + f ) * (g + h) en expresión postfija
`` A , B , + , C , + , D , E , + , F , + , * G , H , + , *`` 
