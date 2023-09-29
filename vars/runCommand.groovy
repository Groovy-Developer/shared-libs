def call(Map config =[:]) {
  loadScript(config)
  def workspacePath = env.WORKSPACE
  sh script: "${workspacePath}/${config.name}"
}
