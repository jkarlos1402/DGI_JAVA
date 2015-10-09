function handleResponse(xhr, status, args) {
    if (args.aceptado) {
        if (args.tipo === "federal") {
            PF('dialogAddFuenteFed').hide();
        } else {
            PF('dialogAddFuenteEst').hide();
        }
    }
}


