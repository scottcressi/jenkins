folder('pipeline') {}
job('pipeline/example2') {
  steps {
      shell('echo Hello World!')
  }
}
