import command.Command
import command.LightOffCommand
import command.LightOnCommand
import command.RemoteControl
import dependency.Light

fun main() {
    var light = Light()

    var control = RemoteControl()
    var lightsOn: Command = LightOnCommand(light)
    var lightsOff: Command = LightOffCommand(light)

    control.setCommand(lightsOn)
    control.pressButton()

    control.setCommand(lightsOff)
    control.pressButton()
}