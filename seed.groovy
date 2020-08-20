folder('pipeline') {}
job('pipeline/example') {
  steps {
      shell('echo Hello World!')
  }
}
