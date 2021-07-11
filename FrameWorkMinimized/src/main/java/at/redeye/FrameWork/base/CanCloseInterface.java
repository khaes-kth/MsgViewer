package at.redeye.FrameWork.base;

import at.redeye.FrameWork.base.tablemanipulator.TableManipulator;

public interface CanCloseInterface
{
    boolean isEdited();
    void saveData();
    int checkSave(TableManipulator tm);
}
