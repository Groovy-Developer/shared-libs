def call(Map config = [:]) {
  def resourceContent = libraryResource("com/example/${config.name}")
  writeFile file: "${config.name}", text: resourceContent
  sh "chmod a+x ./${config.name}"
}
