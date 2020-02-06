package list

class ListFun {

def Create_list_fun()= {

  // method one useing (::)

  val numbers1 = 1 :: (2 :: (3 :: (4 :: (5 :: Nil))))
  val numbers2 = 6 :: 7 :: 8 :: 9 :: 10 :: Nil
  val number3 = (1 :: 2 :: 3 :: Nil) :: (4 :: 5 :: 6 :: Nil) :: (7 :: 8 :: 9 :: 10 :: Nil) :: Nil

  // method 2

  var numbers4: List[Int] = List(11, 12, 13, 14, 15, 16)
  var months: List[String] = List("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
  var numbers6: List[List[Int]] = List(List(1, 2, 3), List(3, 4, 5), List(6, 7, 8), List(9, 10))
  var data =Nil
  var data_print = numbers1 :: numbers2 :: number3 :: numbers4 :: months :: numbers6 :: data:: Nil
  println("Create List using RANGE METHOD "+List.range(1,21))
  //print all lists

  for (data <- data_print) {
    println(data)
  }

  //for each loop
  println("For Each Loop")
  println()
months.foreach(println)
  println("Combine two list using :::")
  println()
  println(numbers1:::numbers2)
  println("Combine two list using ++")
  println()
  println(numbers2++numbers4)
  println("Add element in list using ::")
  println(0::numbers1)
  println("list head "+months.head)
  println("list tail "+months.tail)
  println("multiplication of list Element by 5 "+numbers4.map(_*5))
  println("get substring "+months.map(_.substring(0,3)))
  println("get 1st char "+months.map(_.charAt(0)))
  var list =numbers2:::numbers1
  println("Short this list "+list)
  println(list.sorted)
  println(list.reverse)
  var zip =months.map(_.substring(0,3))
  println("Zip two lists "+zip.zip(months))
  println("List Fill function "+List.fill(5)("guru_gill"))
  println("Get Max number from List "+numbers1.max)
  println("List is empty or not "+number3.isEmpty)
 

}
}
