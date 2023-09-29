def call(Map config =[:]) {
  loadScript(config)
  sh "/bitnami/jenkins/home/workspace/test-pipeline2/${config.name}"
}
