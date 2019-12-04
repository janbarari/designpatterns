package command

import dependency.Light

class LightOnCommand(var light: Light) : Command {

    override fun execute() {
        light.switchOn()
    }
}