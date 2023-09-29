def call(Map config =[:]) {
  loadScript(config)
  sh script: "/bitnami/jenkins/home/workspace/test-pipeline2/${config.name}"
}
