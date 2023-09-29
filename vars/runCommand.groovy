def call(Map config =[:]) {
  loadScript(config)
  def workspacePath = env.WORKSPACE
  echo workspacePath
  sh script: "${workspacePath}/${config.name}"
}
