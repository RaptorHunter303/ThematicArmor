package com.alexjw.thematicarmor.server.armors;

import com.alexjw.thematicarmor.server.specialists.SpecialistManager;

public class ArmorBatman extends Armor {
    public ArmorBatman() {
        super(false, SpecialistManager.specialistOutlast);
    }
}
