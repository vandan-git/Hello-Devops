pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		sh 'echo "Building MyStrings.java"'
                sh '/usr/bin/javac /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.java'
		sh '/usr/bin/jar -cvfm /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.jar /Users/MilindJoshi/MyStuff/Hello-Devops/manifest.txt /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.class'
		sh '/usr/bin/jar -cvf /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.war /Users/MilindJoshi/MyStuff/Hello-Devops/*'
            }
        }
       stage ('post-build') {
              sh 'cp /Users/MilindJoshi/MyStuff/Hello-Devops/MyStrings.war /Users/MilindJoshi/.jenkins/workspace/AutoDeploy'
        }
    }
}
