package itspay.br.com.controller;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;

import itspay.br.com.activity.BaseDrawerActivity;
import itspay.br.com.activity.TrocarEmailActivity;
import itspay.br.com.activity.TrocarSenhaActivity;
import itspay.br.com.authentication.IdentityItsPay;
import itspay.br.com.services.ConnectPortadorService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by juniorbraga on 13/03/17.
 */

public class BaseController extends BaseActivityController<BaseDrawerActivity>{


    Context mContext;
    public BaseController(BaseDrawerActivity activity, Context context){
        super(activity);
        mContext = context;
    }


    public void ligar(final String numero){
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setCancelable(false).setTitle("ItsPay").setMessage("Deseja realmente ligar para " + numero + "?")
                .setPositiveButton("Ligar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                            String uri = "tel:" + numero;
                            Intent intent = new Intent(Intent.ACTION_CALL);
                            intent.setData(Uri.parse(uri));
                            mContext.startActivity(intent);
                        }
                    }
                })
                .setNegativeButton("Cancelar", null)
                .setCancelable(true);
        builder.create().show();
    }

    public void enviarEmail(final String address, final String subject, final String text, final String title){
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setCancelable(false).setTitle("ItsPay").setMessage("Deseja realmente mandar um email para " + address)
                .setPositiveButton("Enviar email", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent email = new Intent(Intent.ACTION_SEND);
                        email.putExtra(Intent.EXTRA_EMAIL, new String[]{address});
                        email.putExtra(Intent.EXTRA_SUBJECT, subject);
                        email.putExtra(Intent.EXTRA_TEXT, text);
                        email.setType("message/rfc822");
                        mContext.startActivity(Intent.createChooser(email, title));
                    }
                })
                .setNegativeButton("Cancelar", null)
                .setCancelable(true);
        builder.create().show();

    }

    public void logout(){
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setCancelable(false).setTitle("ItsPay").setMessage("Tem certeza que deseja sair?")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        forceLogout();
                    }
                })
                .setNegativeButton("Não", null)
                .setCancelable(true);
        builder.create().show();

    }

    public void forceLogout(){
        Call<ResponseBody> callLogout = ConnectPortadorService.getService().logout();

        callLogout.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                IdentityItsPay.getInstance().clean();
                activity.finish();

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                IdentityItsPay.getInstance().clean();
                activity.finish();
                IdentityItsPay.getInstance().clean();
            }
        });
    }




    public void abrirTrocarEmail(){
        Intent trocarEmailIntent = new Intent(mContext, TrocarEmailActivity.class);
        mContext.startActivity(trocarEmailIntent);
    }

    public void abrirTrocarSenha(){
        Intent trocarSenhaIntent = new Intent(mContext, TrocarSenhaActivity.class);
        mContext.startActivity(trocarSenhaIntent);
    }

}

