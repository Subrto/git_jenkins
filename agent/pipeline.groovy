pipeline {
    agent any 
    parameters { 
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

        text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')

        booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

        choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')

        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')

    }

    stages {
        stage(1)
        {
            steps {


            }
        }

        stage(2) {
            steps 
            {

            }
        }

        stage (multiple)
        {
            parallel {
                stage (Test1) {
                    steps 
                    {
                        catchError(buildResult = 'SUCCESS', stageResult = 'FAILURE')
                    }
                }
                
                stage(test2)
                {
                    steps 
                    {

                    }
                }
            }
        }
    }

}