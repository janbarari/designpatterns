package command

import dependency.Light

class LightOffCommand(var light: Light) : Command {

    override fun execute() {
        light.switchOff()
    }
}