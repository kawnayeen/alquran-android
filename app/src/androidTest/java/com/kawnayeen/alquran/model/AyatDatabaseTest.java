package com.kawnayeen.alquran.model;

import android.arch.persistence.room.Room;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertThat;

/**
 * Created by kawnayeen on 6/18/17.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class AyatDatabaseTest {
    private AyatDatabase ayatDatabase;

    @Before
    public void createDatabase() {
        ayatDatabase = Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getTargetContext(),
                AyatDatabase.class).build();
    }

    @Test
    public void testInsertAndCount() {
        assertThat(ayatDatabase.ayatInfoDao().count(), Matchers.is(0));
        AyatInfo ayatInfo = new AyatInfo("001", "001");
        ayatInfo.setArabicText("بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ");
        ayatInfo.setEnglishText("In the Name of Allah, the Most Beneficent, the Most Merciful.");
        ayatInfo.setBengaliText("শুরু করছি আল্লাহর নামে যিনি পরম করুণাময়, অতি দয়ালু।");
        ayatDatabase.ayatInfoDao().save(ayatInfo);
        assertThat(ayatDatabase.ayatInfoDao().count(), Matchers.is(1));
    }

    @After
    public void closeDatabase() {
        ayatDatabase.close();
    }
}