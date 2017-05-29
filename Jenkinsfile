pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		sh 'echo "Building MyStrings.java"'
                sh '/usr/bin/javac /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.java'
		sh '/usr/bin/jar -cvf /Users/MilindJoshi/MyStuff/Hello-Devops/MyWebsite.war /Users/MilindJoshi/MyStuff/Hello-Devops/*.jsp /Users/MilindJoshi/MyStuff/Hello-Devops/*.html'
            }
        }
      }
      post {
           always{
              sh 'cp /Users/MilindJoshi/MyStuff/Hello-Devops/MyWebsite.war /Users/MilindJoshi/.jenkins/workspace/AutoDeploy'
             }
        }
}
