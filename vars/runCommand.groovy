def call(Map config =[:]) {
  loadScript(config)
  sh script: "./${config.name}"
}
