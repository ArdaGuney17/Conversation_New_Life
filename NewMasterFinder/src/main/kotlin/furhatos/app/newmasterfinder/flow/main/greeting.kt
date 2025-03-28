package furhatos.app.newmasterfinder.flow.main

import furhatos.app.newmasterfinder.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Greeting: State = state(Parent) {
    onEntry {
        furhat.say("Hello! My name is Matty, I can help you finding your master's program")
        furhat.ask("Do you want help choosing your master's?")
    }

    onResponse<Yes> {
        furhat.say("Great!")
        goto(AskIfSomethingInMind) // Transition to the next state
    }

    onResponse<No> {
        furhat.say("No worries! Thank you for this short conversation")
        goto(Idle)
    }

}

val AskIfSomethingInMind: State = state(Parent) {
    onEntry {
        furhat.ask("Do you already have something in mind?")
    }
}

