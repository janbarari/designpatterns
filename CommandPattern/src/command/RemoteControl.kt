package command

class RemoteControl {

    lateinit private var command: Command

    fun setCommand(command: Command) {
        this.command = command
    }

    fun pressButton() {
        command.execute()
    }
}