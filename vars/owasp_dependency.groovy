def call(String nvdKey){
  dependencyCheck additionalArguments: "--scan ./ --nvdApiKey ${nvdKey} --nvdDelay 15000 --data /var/jenkins_home/dc-data",
  odcInstallation: 'OWASP'

  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}

