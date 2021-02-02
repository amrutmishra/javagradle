pipeline {
	agent any
	stages {
		stage('Compile') {
            steps {
                gradle clean classes
            }
        }
	}
	stage('Unit Tests') {
            steps {
                gradle test
            }
            post {
                always {
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
    }
	stage('Assemble') {
            steps {
                gralde assemble
               
            }
    }
	stage('Deploy to Production') {
            
            steps {
                gradle deployToTomcat
            }
    }
	post {
        failure {
            mail to: 'mishra.amrut90@gmail.com', subject: 'Build failed', body: 'Please fix!'
        }
    }
}