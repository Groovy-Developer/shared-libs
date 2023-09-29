def call(Map config =[:]) {
  loadScript(config)
  sh "$config.name}"
}
