package StatePattern;

public class Television {
        private State state;
        private TurnedOnState turnedOnState;
        private TurnedOffState turnedOffState;
        private NetflixState netflixState;
        private CableState cableState;


        Television(){
            turnedOnState = new TurnedOnState(this);
            turnedOffState = new TurnedOffState( this);
            cableState = new CableState(this);
            netflixState = new NetflixState(this);
            this.state = turnedOffState;
        }

        public void ChangeChannel(){
                this.state.ChangeChannel();
        }
        public void TurnOn(){
                this.state.TurnOn();
        }
        public void TurnOff(){
                this.state.TurnOff();
        }
        public void PutNetflix(){
                this.state.PutNetflix();
        }


        public void Mute() {
                System.out.println("Muteado");
        }

        public State getState() {
                return state;
        }

        public void setState(State state) {
                this.state = state;
        }

        public TurnedOnState getTurnedOnState() {
                return turnedOnState;
        }



        public TurnedOffState getTurnedOffState() {
                return turnedOffState;
        }


        public NetflixState getNetflixState() {
                return netflixState;
        }


        public CableState getCableState() {
                return cableState;
        }


}
