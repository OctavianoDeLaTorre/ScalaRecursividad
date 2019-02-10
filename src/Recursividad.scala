

object Recursividad {
  def main(args: Array[String]): Unit = {
    
    println("\n===Ejercicio 1===")
    println("Sumatoria: "+sumatoria(1,5))
    
    println("\n===Ejercicio 2===")
    divisores(1,10)
    
    println("\n===Ejercicio 3===")
    println(factorial(5))
    
    println("\n===Ejercicio 4===")
    println(convertirBinario(9, ""))
    
    println("\n===Ejercicio 5===")
    println(numVocales("hola mundo", 0, 0))
    
    println("\n===Ejercicio 6===")
    mostrarDivisores(1, 10)
    
    println("\n===Ejercicio 7===")
    println("Num divisores: "+contarDivisores(1, 10, 0))
  }
  
  //Ejerciccio 1
  def sumatoria(inicio:Int, fin:Int): Int = {
    if(inicio < fin )
      sumatoria(inicio+1, fin)+inicio
    else
      fin
  }
  
  //Ejerciccio 2
  def divisores(inicio:Int, num:Int) {
    if(inicio <= num){
       if((num%inicio) == 0){
         println("Divisor: "+inicio)
       }
       divisores(inicio+1, num)
    }
  }
  
  //Ejerciccio 3
  def factorial(num:Int):Int = {
    if(num == 0){
      1
    }else{
      factorial(num-1)*num
    }
  }
 
  //Ejercicio 4
  def mostrarDivisores(inicio:Int, fin:Int){
    if(inicio <= fin){
       if((fin%inicio) == 0){
         println("Divisor: "+inicio)
       }
       divisores(inicio+1, fin)
    }
  }
 
  //Ejercicio 5
   def contarDivisores(inicio:Int, fin:Int,numDiv:Int):Int ={
    if(inicio <= fin){
       if((fin%inicio) == 0)
          contarDivisores(inicio+1, fin,numDiv+1)
       else
          contarDivisores(inicio+1, fin,numDiv)
    }else{
       numDiv
    }
  }
  
  //Ejerciccio 6
  def convertirBinario(num:Int,numBinario:String):String = {
    if(num == 0)
      numBinario
    else
      convertirBinario(num/2,  (num%2).toString() + numBinario)
  }
 
  //Ejercicio 7
  def numVocales(cadena:String, totalVocales:Int,i:Int):Int={
    if(cadena.length() == i){
      totalVocales
    } else {
      if(esVocal(cadena.charAt(i).toUpper))
       numVocales(cadena,totalVocales+1,i+1)
      else
       numVocales(cadena,totalVocales,i+1)
    }
  }
  
  def esVocal(r:Char):Boolean = {
    if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'||r=='A'||r=='E'||r=='I'||r=='O'||r=='U')
      true
    else
      false
  }
}