pipeline{
  agent any 

   environment {
          IMAGE_NAME = 'online-shopping-app'
          DOCKER_REGISTRY = 'amolgangawane1992' // or private registry
      }

  stages {
    stage('Checkout') {
                steps {
                echo 'checkout from git'
                    git url: 'https://github.com/amolagangawane/online-shopping.git', branch: 'master'
                }
            }
    stage('Build') {
                steps {
                    sh 'chmod +x ./mvnw'
                    sh './mvnw clean package -DskipTests'
                }
            }
  }
}
