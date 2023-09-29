def call(Map config =[:]) {
  loadScript(config)
  def workspacePath = env.WORKSPACE
  echo workspacePath
  sh "ls -la ${workspacePath}/${config.name}"
}
