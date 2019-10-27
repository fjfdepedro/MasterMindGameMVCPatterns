package MasterMindGameMVCPatternsId.models;

import java.util.List;
import MasterMindGameMVCPatternsId.types.Color;

public interface Session {

    StateValue getValueState();

    int getWidth();
}