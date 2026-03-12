# EJERCICIOS JAVA: Streams

Esta práctica está dividida en tres bloques de ejercicios que se resuelven en las clases `BloqueA`, `BloqueB` y `BloqueC` respectivamente. Estas clases ya están creadas y a cada una de ellas se le añadirá un método `main` que permita probar los ejercicios de forma selectiva.

**Cada ejercicio se resolverá usando un único *stream pipeline*.**

#### Bloque A

Para probar los ejercicios de este bloque, usar el método `Datos.getPalabras()`, que retorna una secuencia con todas las palabras de la lengua española.

1. Crea un método estático que acepte una secuencia de palabras y muestre en la consola las palabras que empiecen por 'k', 'ñ',  'w' 'x' o 'y'.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y retorne el resultado de agrupar las palabras de longitud mayor que 3 que comiencen por los mismos 3 caracteres.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y una longitud y muestre en la consola todos los palíndromos de esa longitud. Si la longitud es menor que 3 se lanzará la excepción `IllegalArgumentException`.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y retorne por cada inicial presente en la secuencia, el número de palabras que comienzan por ella. Como posibles iniciales sólo se considerarán las letras de la `'a'` a la `'z'` (minúsculas). Las vocales con tilde se considerarán como vocales sin tilde.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y retorne la longitud de la palabra o palabras mas largas.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y retorne el número de palabras de cada longitud presente en la secuencia.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y retorne una `LinkedList` que contenga las 20 palabras más largas de la secuencia.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y una letra y retorne el resultado de particionar el conjunto de palabras que comienzan por esa letra, separando las de longitud par de las de longitud impar.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y una longitud mayor que 2, y retorne la lista de palabras de esa longitud que están contenidas en otras palabras. Se descartarán todos los casos de palabras contenidas en ellas mismas.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y una longitud mayor que 2, y retorne un mapa en el que se asocie cada palabra de esa longitud con la lista de palabras en las que está contenida. Se descartarán todos los casos de palabras contenidas en ellas mismas.</br></br>

1. Crea un método estático que acepte una secuencia de palabras y una longitud mayor que 2, y retorne un mapa en el que se asocie cada palabra de esa longitud con la lista de palabras que están contenidas en ella. Se descartarán todos los casos de palabras contenidas en ellas mismas.</br></br>


#### Bloque B

Para probar los ejercicios de este bloque, usar el método `Datos.getLineas()`, una secuencia con las líneas del cuento "La Biblioteca de Babel" de Jorge Luis Borges.

1. Crea un método estático que acepte una secuencia de cadenas para extraer de cada una de ellas los elementos que la forman (palabras, uno o más caracteres alfabéticos seguidos, y no-palabras, todo lo que haya entre cada palabra) y almacenarlos en una lista. Finalmente se retornará una lista de listas que contenga todas las anteriores.</br></br>

1. Crea un método estático que acepte una secuencia de cadenas y retorne el máximo número de elementos contenidos en una línea.</br></br>

1. Lo mismo que en el ejercicio anterior, pero aceptando una lista como la que retorna el metodo creado en el ejercicio 1.</br></br>

1. Crea un método estático que acepte una lista como la que retorna el ejercicio 1 y retorne una lista de cadenas que contenga las palabras y no-palabras en orden de aparición.</br></br>

1. Crea un método estático que acepte una secuencia de cadenas y retorne una lista de cadenas que contenga las palabras y no-palabras en orden de aparición.</br></br>

1. Crea un método estático que acepte una secuencia de cadenas y retorne el conjunto de palabras que se repiten.</br></br>

1. Crea un método estático que acepte una secuencia de cadenas y retorne la longitud media.</br></br>

1. Crea un método estático que acepte una secuencia de cadenas y retorne un mapa que asocie longitudes de palabra con el número de palabras de dicha longitud. Solo se tendrán en cuenta las diferentes longitudes de las palabras contenidas en la secuencia.</br></br>

1. Crea un método estático que acepte una secuencia de cadenas y retorne el total de palabras en la secuencia sin contar las repetidas.</br></br>

1. Crea un método estático que acepte una secuencia de cadenas y retorne el total de vocales y consonantes de la secuencia.</br></br>

1. Crea un método estático que acepte una secuencia de cadenas y una longitud `l`, y retorne todas las subcadenas longitud `l` de cada palabra presentes en la secuencia cuya longitud sea mayor que `l`.</br></br>

