package net.mc.tools.models.updateOneTimePasswordReset.updateOneTimePasswordResetRequest;

public class UpdateOneTimePasswordResetRequestModel
{
    private String password;

    private String newPassword;

    private String email;

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getNewPassword ()
    {
        return newPassword;
    }

    public void setNewPassword (String newPassword)
    {
        this.newPassword = newPassword;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }
}
