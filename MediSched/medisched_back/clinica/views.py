from rest_framework import viewsets
from rest_framework.views import APIView
from .models import Especialidade, Medico, Paciente, Sala, Consulta
from rest_framework.response import Response
from rest_framework.permissions import IsAuthenticated
from .serializers import (
    EspecialidadeSerializer,
    MedicoSerializer,
    PacienteSerializer,
    SalaSerializer,
    ConsultaSerializer,
    MedicoDetalhesSerializer,
    ConsultaDetalhesSerializer
)



class EspecialidadeViewSet(viewsets.ModelViewSet):
    permission_classes = [IsAuthenticated]
    queryset = Especialidade.objects.all()
    serializer_class = EspecialidadeSerializer


class MedicoViewSet(viewsets.ModelViewSet):
    permission_classes = [IsAuthenticated]
    queryset = Medico.objects.all()
    serializer_class = MedicoSerializer

class MedicoApiView(APIView): 
    permission_classes = [IsAuthenticated]
    def get(self, request, id):
        try:
            # Busca o médico pelo ID
            medico = Medico.objects.get(id=id)
            
            # Serializa o médico, incluindo os dados da especialidade
            serializer = MedicoDetalhesSerializer(medico)
            
            # Retorna a resposta com os dados serializados
            return Response(serializer.data)
        
        except Medico.DoesNotExist:
            return Response({"detail": "Médico não encontrado."}, status=404)


class PacienteViewSet(viewsets.ModelViewSet):
    permission_classes = [IsAuthenticated]
    queryset = Paciente.objects.all()
    serializer_class = PacienteSerializer


class SalaViewSet(viewsets.ModelViewSet): 
    permission_classes = [IsAuthenticated]
    queryset = Sala.objects.all()
    serializer_class = SalaSerializer


class ConsultaViewSet(viewsets.ModelViewSet):
    permission_classes = [IsAuthenticated]
    queryset = Consulta.objects.all()
    serializer_class = ConsultaSerializer


class ConsultasApiView(APIView):
    permission_classes = [IsAuthenticated]
    def get(self, request, id=None):
        if id:
            try:
                # Busca a consulta pelo ID
                consulta = Consulta.objects.get(id=id)
                # Serializa a consulta
                serializer = ConsultaDetalhesSerializer(consulta)
                # Retorna a resposta com os dados serializados
                return Response(serializer.data)
            except Consulta.DoesNotExist:
                return Response({"detail": "Consulta não encontrada."}, status=404)
        
        # Caso não tenha ID, lista todas as consultas
        consultas = Consulta.objects.all()
        serializer = ConsultaDetalhesSerializer(consultas, many=True)
        return Response(serializer.data)
