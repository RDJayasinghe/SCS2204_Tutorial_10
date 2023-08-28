object LetterCounter {
  def countLetterOccurrences(words: List[String]): Int = {
     val letterCounts = words.map(_.length) // Map each word to its length
     val totalLetterCount = letterCounts.reduce(_ + _) // Reduce by summing up the counts
     totalLetterCount
  }

  def main(args: Array[String]): Unit = {
     val inputWords = List("apple", "banana", "cherry", "date")
     val totalLetterCount = countLetterOccurrences(inputWords)
     println(totalLetterCount)
  }
}
