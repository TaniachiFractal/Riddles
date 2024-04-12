package maslovat.taniachifractal.riddles

import kotlinx.coroutines.withTimeoutOrNull

/**Data of a single riddle*/
class Riddle(
    private val id:Int,
    private val text: String,
    private val answer:String,
    private val wrong0:String,
    private val wrong1:String,
    private val wrong2:String
)
{
    public fun getText():String
    {
        return text
    }
    public fun getAnswer():String
    {
        return answer
    }
    public fun getWrong(i:Int):String
    {
        return when(i)
        {
            0 -> wrong0;
            1 -> wrong1;
            2 -> wrong2;
            else -> "error"
        }
    }
}
/**List of data of all riddles*/
var riddlesTable = arrayListOf(
    Riddle(1,"Какая функция выводит данные с переносом строки в Kotlin?",
        "println()","write()","printf()","print()"),
    Riddle(2,"Как задать цикл for в Pascal?",
        "for i:=n0 to n do ","for i in n do","for loop end","for (int i=n0; i<n; i++)"),
    Riddle(3,"Какой формы условие в блок-схеме?",
        "Ромб","Квадрат","Параллелепипед","Круг"),
    Riddle(4,"Как задать ссылку в HTML?",
        "<a href=\"page.html\">","<link page.html>","<link source=\"page.html\">","<a src=\"page.html\""),
    Riddle(5,"Как задать массив в С++?",
        "int* arr = new int[n];","var arr = arrayOfInt;","array arr = new array();","arr=1,2,3"),
    Riddle(6,"Ключевое слово для объявления метода в Python?","def","fun","func","int"),
    Riddle(7,"Сидит девица в темнице, а коса на улице",
        "Морковка","Э, куда, где вопросы по программированию?!","Почему так банально?","Огурец"),
    Riddle(8,"Зимой и летом одним цветом",
        "Ёлка","Рояль","Интерфейс","Кнопка"),
    Riddle(9,"Ответ на главный вопрос жизни, вселенной и всего такого",
        "42","3","7","100"),
    Riddle(10,"Как сделать, чтобы в XML разметке для андроид дочерние объекты были в центре родительского?",
        "android:gravity=\"center\"","android:align=\"center\"",
        "android:layout_gravity=\"center\"","android:children=\"center\"")
)
