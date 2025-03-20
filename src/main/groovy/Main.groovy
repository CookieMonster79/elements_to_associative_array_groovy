static def countElements(List list) {
  list.countBy { it }
}

// Функция для ввода списка с клавиатуры
def inputListFromKeyboard() {
  def reader = new BufferedReader(new InputStreamReader(System.in))
  def input = ""

  while (true) {
    println "Введите элементы списка через запятую (например, 1, 2, a, b):"
    input = reader.readLine().trim() // Чтение ввода с клавиатуры и удаление лишних пробелов

    // Проверка на пустую строку или отсутствие запятых
    if (input.isEmpty() || !input.contains(",")) {
      println "Ошибка: строка должна содержать элементы, разделенные запятой. Попробуйте снова."
    }
    // Проверка, что последний символ не запятая
    else if (input.endsWith(",")) {
      println "Ошибка: строка не должна заканчиваться запятой. Попробуйте снова."
    }
    else {
      break // Ввод корректен, выходим из цикла
    }
  }

  return input.split(",")*.trim() // Разделение строки по запятой и удаление лишних пробелов
}

// Основной код
def myList = inputListFromKeyboard() // Ввод списка с клавиатуры
def countedElements = countElements(myList) // Подсчет элементов

println "Результат:"
println(countedElements)