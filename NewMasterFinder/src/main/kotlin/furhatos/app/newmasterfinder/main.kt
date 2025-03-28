package furhatos.app.newmasterfinder

import furhatos.app.newmasterfinder.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class NewmasterfinderSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
