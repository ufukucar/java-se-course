package com.ufukucar.tasit;

import com.ufukucar.kurallar.Kanun;
import com.ufukucar.kurallar.UlastirmaDairesi;
import com.ufukucar.base.Arac;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class Taksi  extends Arac implements Kanun, UlastirmaDairesi {
    @Override
    public int hisSiniri() {
        return 120;
    }

    @Override
    public String bakimDurumu() {
        return "Haziran ayında";
    }

    @Override
    public int tasitVerigis() {
        return 1_000;
    }

    @Override
    public Boolean ruhsatDurumu() {
        return Boolean.TRUE;
    }

    @Override
    public Boolean ehliyetDurumu() {
        return Boolean.TRUE;
    }
}
