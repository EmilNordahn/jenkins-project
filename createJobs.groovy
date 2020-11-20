pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('test-pipeline-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/EmilNordahn/techPipelineGradleTest.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}