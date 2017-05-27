pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		sh 'echo "Building MyStrings.java"'
                sh 'javac MyStrings.java'
            }
        }
    }
}
