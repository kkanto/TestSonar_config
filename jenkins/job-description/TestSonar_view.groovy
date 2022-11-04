 
listView('TestSonar Jobs') {
    description('TestSonar Jobs')
    jobs {
        regex('TestSonar_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
