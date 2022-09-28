**Ejercicio 1**

					7
				/  \
			 9     8 
		   / \
		10  11
_InOrden_: 10 , 9 , 11 , 7  , 8 
_PostOrden_: 10 , 11 , 9 , 8 , 7 
_PreOrden_: 7 , 9 , 10 , 11 , 8 

				3
				 \
					 7
				   / \
				8    9
			  / \    \ 
			10 11    18 
_InOrden_:  3 , 10 , 8 , 11 , 7 , 9 , 18 ,
_PostOrden_: 10 , 11 , 8 ,18  , 9 , 7 , 3 
_PreOrden_: 3 , 7 , 8 , 10 , 11 , 9 , 18

			  8
			/
		 10
		/ \
	13  15 
_InOrden_: 13 , 10 , 15 , 8
_PostOrden_: 13 , 15 , 10 , 8 
_PreOrden_: 8 ,  10 , 13  , 15 

**Ejercicio 2** 
Construya el árbol binario a partir del cuál se obtuvieron los siguientes recorridos 
- inorden: C B F E G A D I H 
- y postorden : C F G E B I H D A

InOrden hi - r - hd 
PostOrden : hi - hd - r 

Entonces, la A es la raíz 
- inorden: C B F E G **A** D I H 
- y postorden : C F G E B I H D **A**
Y me queda C B F E G de hijo izquierdo , y D I H de hijo derecho 

						A 
					/   \
	C B F E G    D I H   

Analizamos los términos 
- inorden:  D I H 
- y postorden :  I H D 

D es la raíz, H el hijo derecho e I el hijo izquierdo de H 

El otro término 
- inorden: C B F E G A 
- y postorden : C F G E B 

B es la raíz 

C es el hijo izquierdo de B y FEG el hijo derecho. 

- inorden:   F E G  
- y postorden :  F G E 

E es la raíz (hijo derecho de B), donde F es su hijo izquierdo y G su hijo derecho. 

						A 
					/   \
			      B     D
			    / \   / \ 
			  C   E -   H 
			          /\   / 
			        F G  I   




